class Solution:
    def checkIfPangram(self, sentence: str) -> bool:

        dic= set()
        for char in sentence:
            if char.isalpha():
                dic.add(char.lower())
            
        return len(dic)==26
       