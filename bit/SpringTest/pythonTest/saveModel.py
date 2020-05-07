import pandas as pd
from sklearn import svm, model_selection, neighbors
import random
import pickle
import joblib

df = pd.read_csv("iris.csv")
# model_selection.train_test_split(문제, 답)
# data = model_selection.train_test_split(df.iloc[:, 0:4], df.iloc[:, 4])
train_data, test_data, train_label, test_label = tuple(model_selection.train_test_split(df.iloc[:, 0:4], df.iloc[:, 4]))

knn = neighbors.KNeighborsClassifier(n_neighbors=1)
knn.fit(train_data, train_label)
joblib.dump(knn, "iris.pkl")
print("공부했습니다.")