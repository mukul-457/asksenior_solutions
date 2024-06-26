class Solution:
    def diffWaysToCompute(self, expression: str):
        ans = []
        n = len(expression)
        isSingleNumber = True
        
        for i in range(n):
            if expression[i] in ('+', '-','*'):
                isSingleNumber = False
                left_ans = self.diffWaysToCompute(expression[:i])
                right_ans= self.diffWaysToCompute(expression[i+1:])
                for l in left_ans:
                    for r in right_ans:
                        ans.append(self.perform(l,r,expression[i]))
        if isSingleNumber:
            ans.append(int(expression))
        return ans
    
    def perform(self,a,b,op):
        if op == "+":
            return a+b
        if op == "-":
            return a-b
        if op == "*":
            return a*b
        
s = Solution()
res = s.diffWaysToCompute("2*3-4*5")
print(res)