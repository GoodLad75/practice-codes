num = int(input("Enter number: "))

def num2words(num):
    
    units = ("", "one ", "two ", "three ", "four ","five ", "six ", "seven ","eight ", "nine ", "ten ",
            "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ","sixteen ", "seventeen ",
            "eighteen ", "nineteen ")

    tens =("", "", "twenty ", "thirty ", "forty ", "fifty ","sixty ","seventy ","eighty ","ninety ")
    ## blank space for indexing

    if num < 0:
        return "negative " + num2words(-num)
    
    if num < 20: ## FOR 1 - 19
        return units[num]
    
    if num < 100: ## FOR 21 - 99
        return  tens[num // 10]  + units[int(num % 10)] 
    
    if num < 1000: ## FOR 100 - 999
        return units[num // 100]  + "hundred " + num2words(int(num % 100))

    if num < 1_000_000: ## FOR 1000- 999 999
        return  num2words(num // 1000) + "thousand, " + num2words(int(num % 1000))

    if num < 1_000_000_000: ## FOR 1 000 000 TO 9 999 999    
        return num2words(num // 1_000_000) + "million, " + num2words(int(num % 1_000_000))

    if num < 1_000_000_000_000:
        return num2words(num // 1_000_000_000) + "billion, "+ num2words(int(num % 1_000_000_000))
    
    if num < 1_000_000_000_000_000:
        return num2words(num // 1_000_000_000_000) + "trillion, "+ num2words(int(num % 1_000_000_000_000))
    
    if num < 1_000_000_000_000_000_000:
        return num2words(num // 1_000_000_000_000_000) + "quadrillion, " + num2words(int(num % 1_000_000_000_000_000))

result = num2words(num)
print("\nNumber: ", num)
print("Word Form: ", result)