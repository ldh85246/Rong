import requests
import re
url = "https://www.aladin.co.kr/shop/common/wnew.aspx?ViewRowsCount=50&ViewType=Detail&SortOrder=6&page=1&BranchType=1&PublishDay=168&CID=437&NewType=SpecialNew&CustReviewRankStart=&CustReviewRankEnd=&CustReviewCountStart=&CustReviewCountEnd=&PriceFilterMin=&PriceFilterMax=&SearchOption="

text = requests.get(url).text
# print(text)

list = re.findall('<div class="ss_book_list">(.+?)</b></li> </ul></div>', text, re.DOTALL)
for line in list :
    title = re.findall('class="bo3"><b>(.+?)</b></a>', line)
    price = re.findall('<span class="ss_p2" ><b><span class="">(.+?)</span>원</b></span>', line)
    writer = re.findall('<li><a href="/Search/.+?">(.+?)</a>.+?지은이.+?<A href', line)
    date = re.findall('2020년 (.+?)월</li><li><span class="">.+?원 →',line)
    if len(date) > 0 :
        if int(date[0]) == 4 :
            print(title, price, writer, date)

# print(len(list))