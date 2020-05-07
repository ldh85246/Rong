# 사용자한테 꽃잎의 길이, 꽃잎의 넓이, 꽃밭침의 길이, 꽃받침의 넓이를 입력받아
# 붓꽃의 품종을 예측하는 웹 어플리케이션을 구현해봅니다.

import pandas as pd
from sklearn import svm, model_selection, neighbors
import random

def getName(userData):
    # df = pd.read_csv("../iris.csv")
    # train_data, test_data, train_label, test_label = tuple(model_selection.train_test_split(df.iloc[:, 0:4], df.iloc[:, 4]))
    #
    # knn = neighbors.KNeighborsClassifier(n_neighbors=1)
    # knn.fit(train_data, train_label)
    #
    # # 4.8, 3.1, 1.6, .2, "Setosa"
    # # userData = [[4.8, 3.1, 1.6, .2]]
    # result = knn.predict(userData)
    model = joblib.load("iris.pkl")
    result = model.predict(userData)
    return result