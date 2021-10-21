nome = readline(prompt="Digite seu nome:")
print(nome)
peso = readline("Informe seu peso: ")
peso = as.integer(peso)
altura = readline("Informe sua altura: ")
altura = as.double(altura)
imc = peso/altura^2

print(round(imc,2))

print(sprintf("Olá, %s! Seu IMC é: %1f.",nome,imc))

paste(nome,peso,altura,imc)

testeCat = cat(nome, imc)
print(testeCat)