import requests
import re

url = 'https://www.hanbit.co.kr/data/books/B9288599157_l.jpg'

data = requests.get(url).content
f = open("book.jpg", "wb")
f.write(data)
f.close()
print("이미지를 다운받았습니다.")