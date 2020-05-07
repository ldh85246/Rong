import requests
from bs4 import BeautifulSoup

url = "https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%98%A4%EB%8A%98%EC%9D%98+%EA%B8%88%EC%8B%9C%EC%84%B8"
text = requests.get(url).text
# print(text)

soup = BeautifulSoup(text, "html.parser")
r = soup.select_one("#elGoldRateInfo > div.box > div > div.present > div > div > p:nth-child(1) > em").string
print(r)