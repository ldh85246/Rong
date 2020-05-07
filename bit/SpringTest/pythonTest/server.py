from flask import Flask, render_template, request
import myUtil.hanbit_newbook as book
import myUtil.webtoon as wt
import myUtil.goods as goods
import os
import myUtil.iris as iris

app = Flask(__name__)

# jsonp는 sts와 python이 서로 응답할 수 있는 이해관계를 설정하기 위해 진행함

@app.route("/inputIris")
def inputIris():
    return render_template("inputIris.html")

@app.route("/resultIris", methods=['POST'])
def resultIris():
    sl = float(request.form['sl'])
    sw = float(request.form['sw'])
    pl = float(request.form['pl'])
    pw = float(request.form['pw'])

    userData = [[sl, sw, pl, pw]]
    r = iris.getName(userData)
    return r[0]

# "sepal.length","sepal.width","petal.length","petal.width"

@app.route("/goodsDelete/<no>")
def goodsDelete(no) :
    g = goods.getGoods(int(no))
    fname = g['fname']
    re = goods.delete(int(no))
    if re > 0 :
        os.remove("./static/img/" + fname)
    return "ok"

@app.route("/goodsUpdateOk", methods=['POST'])
def goodsUpdateOk() :
    no = int(request.form['no'])
    item = request.form['item']
    qty = int(request.form['qty'])
    price = int(request.form['price'])
    detail = request.form['detail']
    oldFname = request.form['oldFname']
    f = request.files['fname']
    fname = oldFname
    print("업로드파일명:", fname)

    if f.filename != "" :
        f.save("./static/img/" + f.filename)
        fname = f.filename

    q = {"no":no}
    doc = {"item":item, "qty":qty, "price":price, "fname":fname, "detail":detail}
    re = goods.update(q, doc)
    if re > 0 and f.filename != "" :
        os.remove("./static/img/" + oldFname)
    return "ok"

@app.route("/goodsUpdate/<no>")
def goodsUpdate(no) :
    g = goods.getGoods(int(no))
    return render_template("goodsUpdate.html", g=g)

@app.route("/goodsDetail/<no>")
def goodsDetail(no) :
    doc = goods.getGoods(int(no))
    print(doc)
    return render_template("goodsDetail.html", doc=doc)

@app.route("/goodsInsertOk", methods=['POST'])
def goodsInsertOk() :
    no = int(request.form['no'])
    item = request.form['item']
    qty = int(request.form['qty'])
    price = int(request.form['price'])
    # fname = request.form['fname']
    f = request.files['fname']
    f.save("./static/img/" + f.filename)
    fname = f.filename
    detail = request.form['detail']
    doc = {"no":no, "item":item, "qty":qty, "price":price, "fname":fname, "detail":detail}
    _id = goods.insert(doc)
    print(_id)
    return "ok"

@app.route("/goodsInsert")
def goodsInsert() :
    return render_template("goodsInsert.html")

@app.route("/goodsList")
def goodsList() :
    list = goods.listAll()
    return render_template("goodsList.html", list=list)

@app.route("/webtoon")
def webtoon() :
    list = wt.getData()
    r = "pro("+str(list)+")"
    return r
    # return "함수이름(데이터)"

@app.route("/newBook")
def newBook() :
    list = book.getNewBook()
    r = "pro("+str(list)+")"
    return r
    # return  render_template("newBook.html", list=list)

if __name__ == "__main__" :
    app.run(host='192.168.0.158', debug=True)