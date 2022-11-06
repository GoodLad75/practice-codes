
choice_menu = 0
change = 0
onePieceRice, twoPieceRice = 0, 0
ansConst = 0
ctrord = 0

def menu():
    print(" ==========[ MEALS ]=========== ")
    print(" [1] CHICKEN ")
    print(" [2] FISH FILLET ")
    print(" [3] BURGER STEAK ")
def submenu():
    print(" ==========[ Choices ]=========== ")
    print(" [1] One piece with Rice ")
    print(" [2] Two piece with Rice ")


print("\tWelcome to the Chicken Casa!\t")
print("\t     Here is our menu\t")

while ansConst == 0:
    menu()
    ans_menu = (int (input("Please enter your choice: ")))

    if ans_menu == 1:
        print("Chicken Sub Menu")
        submenu()
        choice_menu = int(input("Your order: "))
        
        if choice_menu == 1:
            onePieceRice = 100 
        elif choice_menu == 2:
            twoPieceRice = 150
    
    elif ans_menu == 2:
        print("Fish Fillet Sub Menu")
        submenu()
        choice_menu = int(input("Your order: "))
        
        if choice_menu == 1:
            onePieceRice = 110
        elif choice_menu == 2:
            twoPieceRice = 130
    
    elif ans_menu == 3:
        print("Burger Steak Sub Menu")
        submenu()
        choice_menu = int(input("Your order: "))
        
        if choice_menu == 1:
            onePieceRice = 115
        elif choice_menu == 2:
            twoPieceRice = 125
    
    ##QUANTITY OF ORDERS
    orderAmt = int(input("Please specify amount of orders: "))
    if choice_menu == 1:
        totalFinal = onePieceRice * orderAmt
    elif choice_menu == 2:
        totalFinal = twoPieceRice * orderAmt
    
    print("TOTAL BILL: " + str(totalFinal))

    ##LOOPBACK
    ansConst = input("Do you want to continue ordering? >>")

    ##FINAL BILL
    ctrord += totalFinal



print("TOTAL BILL: " + str(ctrord))
payment = int (input("PAYMENT: "))

##COMPUTE CHANGE
if payment > ctrord:
    change = payment - ctrord
elif payment < ctrord:
    print("INSUFFICIENT FUNDS.")

print("CHANGE:" , change)









