#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the bonAppetit function below.
def bonAppetit(bill, k, b):
    s=0
    for i in range(0,len(bill)):
        if(i != k):
            s+=bill[i]
    l=int(s/2)
    if(l==b):
        print("Bon Appetit")
    else:
        c=b-l
        print(c)
if __name__ == '__main__':
    nk = input().rstrip().split()

    n = int(nk[0])

    k = int(nk[1])

    bill = list(map(int, input().rstrip().split()))

    b = int(input().strip())

    bonAppetit(bill, k, b)
