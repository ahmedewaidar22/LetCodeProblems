class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        stack=[]
        res=[]
        def backtrack(openn,closen):
            if closen< openn:
                stack.append(")")
                backtrack(openn,closen+1)
                stack.pop()
            if openn < n:
                stack.append("(")
                backtrack(openn + 1, closen)
                stack.pop()
            if openn==closen==n:
                res.append("".join(stack))
                return

        backtrack(0,0)
        return res