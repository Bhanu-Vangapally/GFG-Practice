def printIncreasingPower(x):
    #code here
    # Loop to jump in powers of 2
    c=1
    while(c<=x):
        #code here
        if c**2<=x:
            print ( c**2, end = " ")
            c+=1
        else:
            break
    
        #code here