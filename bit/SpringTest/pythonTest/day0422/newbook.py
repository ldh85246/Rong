import requests
import re

url = 'https://www.hanbit.co.kr/store/books/new_book_list.html'
text = requests.get(url).text
# img_list = re.findall('<img src="/data/books/(.+?).jpg" alt="" class="thumb" />', text, re.DOTALL)
# print(img_list)
list = re.findall('<li class="sub_book_list">(.+?)</li>', text, re.DOTALL)

# for i in img_list:
#     data = requests.get("https://www.hanbit.co.kr/data/books/"+i).content
#     img = "book_img/" + i + ".jpg"
#     f = open(img, "wb")
#     f.write(data)
#     f.close()

n = 1
for book in list :
    img_url = re.findall('<img src="(.+?)" alt="" class="thumb" />', book)
    data = requests.get("https://www.hanbit.co.kr/" + img_url[0]).content
    fname = "book" + str(n) + ".jpg"
    f = open("book_img/" + fname, "wb")
    f.write(data)
    f.close()
    n = n +1
    print(n,"번째 그림을 다운 받았습니다.")