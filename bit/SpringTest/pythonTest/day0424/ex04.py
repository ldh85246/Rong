from bs4 import BeautifulSoup

html = '''
    <html>
        <body>
            <ul>
                <li><a href="http://www.naver.com">naver</a></li>
                <li><a href="http://www.daum.net">daum</a></li>
            </ul>
        </body>
    </html>
'''

# #elGoldRateInfo > div.box > div > div.present > div > div > p:nth-child(1) > em

soup = BeautifulSoup(html, "html.parser")
links = soup.find_all("a")
print(len(links))

for a in links:
    url = a.attrs["href"]
    text = a.string
    print(url, text)