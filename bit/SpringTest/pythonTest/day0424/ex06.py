from sklearn import svm

xor_data = [
    [0, 0, 0],
    [0, 1, 1],
    [1, 0, 1],
    [1, 1, 1]
]

data = []
label = []

for row in xor_data:
    p = row[0]
    q = row[1]
    r = row[2]
    data.append([p, q])
    label.append(r)

# print(data)
# print(label)

clf = svm.SVC()
clf.fit(data, label)
pre = clf.predict(data)
print(pre)