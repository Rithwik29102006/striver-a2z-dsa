class solution:
    def armstrong_number(self,num):
        temp=num
        sum=0
        while temp>0:
            digit=temp%10
            sum+=digit**3
            temp//=10
        if sum==num:
            return True
        else:
            return False