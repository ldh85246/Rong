from pymongo import MongoClient

url = "localhost"
port = 27017
dbName = "bit"
colName = "goods"

def delete(no) :
    client = MongoClient(url, port)
    db = client[dbName]
    goods = db[colName]
    doc = {"no":no}
    # re = goods.delete_one(doc).deleted_count
    re = goods.delete_one(doc).raw_result['n']
    print(re)
    return re

def update(q, doc) :
    client = MongoClient(url, port)
    db = client[dbName]
    goods = db[colName]
    # re = goods.update_one(q, {"$set":doc}).modified_count
    re = goods.update_one(q,{"$set":doc}).raw_result['n']
    print("re : ", re)
    return re

def getGoods(no) :
    print("상품번호 : ", no)
    client = MongoClient(url, port)
    db = client[dbName]
    goods = db[colName]
    doc = goods.find_one({"no":no})
    return doc

def insert(doc) :
    client = MongoClient(url, port)
    db = client[dbName]
    goods = db[colName]
    _id = goods.insert_one(doc).inserted_id
    return _id

def listAll() :
    arr = []
    client = MongoClient(url, port)
    db = client[dbName]
    goods = db[colName]
    list = goods.find({}, {"_id": 0})
    print(type(list))
    for g in list:
        arr.append(g)
    return arr