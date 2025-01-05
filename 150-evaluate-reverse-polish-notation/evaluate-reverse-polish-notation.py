class Solution:
    def evalRPN(self, tokens: List[str]) -> int:

        stack=[]
        for char in tokens:
            if char == "+":
                stack.append(stack.pop()+stack.pop())
            elif char == "/":
                y=stack.pop()
                x=stack.pop()
                stack.append(int(x/y))
            elif char == "-":
                y=stack.pop()
                x=stack.pop()
                stack.append(x-y)
            elif char == "*":
                stack.append(stack.pop()* stack.pop())
            else:
                stack.append(int(char))
        return stack.pop()
        
        