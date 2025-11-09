
"""
title  : 2941. 크로아티아 알파벳 (Silver 5)
time   : ms   ms
memory : KB   KB
"""

import sys

def solution():
    input = sys.stdin.readline

    N = input().rstrip()
    N_len = len(N)

    answer = 0
    
    for temp in ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]:
        if temp in N:
            answer += 1
            N_len -= len(temp)

    answer += N_len

    return answer

print(solution())

