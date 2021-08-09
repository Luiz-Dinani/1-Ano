peso = float(input("Insira seu peso (em kg): "))
altura = float(input("Insira sua altura (em m): "))
imc = peso/(altura**2)
print('O seu IMC é de {:.1f}'.format(imc)) #formata o imc para 1 casa decimal, ou seja, se colocar {.:2f}'.format ele vai deixar 2 casas decimais
