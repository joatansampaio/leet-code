
'''
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

'''

def mergeAlternately(word1, word2): 
    """
    :type word1: str
    :type word2: str
    :rtype: str
    """
    result = ""
    length = min(len(word1), len(word2))

    for i in range(length):
        result += word1[i] + word2[i]

    if len(word1) > len(word2):
        result += word1[length:]
        return result
    result += word2[length:]
    return result

print(mergeAlternately("abc", "pqr"))

# Comment