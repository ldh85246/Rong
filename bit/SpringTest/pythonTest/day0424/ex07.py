import pandas as pd
from sklearn import svm

df = pd.read_csv("../iris.csv")
data = df.iloc[:, 0:4]
label = df.iloc[:, 4]

clf = svm.SVC()
clf.fit(data, label)

# 4.3, 3, 1.1, .1, "Setosa"
newData = [[4.3, 3, 1.1, .1]]
r = clf.predict(newData)
print(r)

# print(type(data))
# print(type(label))

# print(data)
# print(label)

# print(df.iloc[:, 0:4])
# print(df.iloc[:, 4])

# print(df.iloc[0, 0])
# print(df[0, 0])       # 불가

# data = pandas.read_csv("iris.csv")
# print(data)
# print(type(data))