
"""
title  : 12906. 같은 숫자는 싫어 (Level 1)
"""

def solution(arr):
    answer = []

    answer.append(arr[0])

    for num in arr[1:]:

        if answer[-1] == num:
            continue

        answer.append(num)
        
    return answer


print(solution([1,1,3,3,0,1,1]))        # [1,3,0,1]
print(solution([4,4,4,3,3]))            # [4,3]