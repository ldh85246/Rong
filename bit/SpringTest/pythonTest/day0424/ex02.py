from bs4 import BeautifulSoup

html = '''
    <html>
        <body>
            <h1>스크레이핑이란?</h1>
                <p>웹 페이지를 분석하는 것</p><p>원하는 부분을 추출하는 것</p>
        <body>
    </html>
'''

soup = BeautifulSoup(html, "html.parser")
p1 = soup.html.body.p
a = p1.next_sibling
print(a)
print(type(a))

# p2 = p1.next_sibling.next_sibling     # 블랭크가 있을 시 하나의 요소로 인식하기 때문에 2번 입력
# print(p2.string)

# h1 = soup.html.body.h1
# print(p1.string)
# print(h1)
# print(type(h1))
# print(h1.string)