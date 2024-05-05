number = float(input())

list = (100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.25, 0.10, 0.05, 0.01)

temp = 0

for el in list:
    if temp == 0:
        print("NOTAS:")
    if temp == 6:
        print("MOEDAS:")
    temp +=1
    count = int(number / el)
    number = round(number % el, 2)
    if temp <= 6:
        print(count, "nota(s) de R$", format(el, '.2f'))
    if temp > 6:
        print(count, "moeda(s) de R$", format(el, '.2f'))