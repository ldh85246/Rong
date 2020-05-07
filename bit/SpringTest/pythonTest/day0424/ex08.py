import pandas as pd
from sklearn import svm, model_selection, neighbors
import random

df = pd.read_csv("../iris.csv")
# model_selection.train_test_split(문제, 답)
# data = model_selection.train_test_split(df.iloc[:, 0:4], df.iloc[:, 4])
train_data, test_data, train_label, test_label = tuple(model_selection.train_test_split(df.iloc[:, 0:4], df.iloc[:, 4]))
print(len(train_data))
print(len(test_data))
print(len(train_label))
print(len(test_label))

# 연습) 훈련데이터로 공부시키고 테스트데이터로 예측해봅니다.
# clf = svm.SVC()
# clf.fit(train_data, train_label)

knn = neighbors.KNeighborsClassifier(n_neighbors=1)
knn.fit(train_data, train_label)

# 4.8, 3.1, 1.6, .2, "Setosa"
userData = [[4.8, 3.1, 1.6, .2]]
result = knn.predict(userData)
print(result)

# score = knn.score(test_data, test_label)
# print("정확도 : ", score)

# pre = clf.predict(test_data)

# print(pre[0])
# print(test_label.iloc[0])
# print(type(pre))
# print(type(test_label))

# n = 0
# for i in range(len(pre)):
#     if pre[i] == test_label.iloc[i]:
#         n = n + 1
# print('정답수 : ', n)


# print(pre)
# print(test_label)


# print(data[0])      # 112   훈련시킬 문제
# print(len(data[1])) # 38    테스트할 문제
# print(data[2])      # 112   훈련에 대한 답
# print(data[3])      # 38    테스트할 답
# print(type(data))

# data = df.iloc[:, 0:4]
# label = df.iloc[:, 4]
#
# clf = svm.SVC()
# clf.fit(data, label)