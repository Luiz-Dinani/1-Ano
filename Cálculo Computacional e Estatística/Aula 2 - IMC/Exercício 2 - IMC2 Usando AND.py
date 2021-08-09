peso = float(input("Insira seu peso (em kg): "))
altura = float(input("Insira sua altura (em m): "))
imc = peso/(altura**2)

print("O seu IMC é de {:.1f}".format(imc))

if imc<18.5:
    print("Diagnóstico: Abaixo do peso ideal")

elif imc>=18.5 and imc<25:
    print("Diagnístico: Peso ideal")

elif imc>=25 and imc<30:
    print("Diagnóstico: Acima do peso ideal")

elif imc>=30 and imc<40:
    print("Diagnóstico: Obeso")

elif imc>40:
    print("Diagnóstico: Obesidade Mórbida, tá porra")