import psutil

#Variáveis CPU
qtdCpusTotal = psutil.cpu_count()
qtdCpusFisicas = psutil.cpu_count(logical = False)
pctCpus = psutil.cpu_percent(percpu = True, interval = 10)
freqCpus = psutil.cpu_freq()

#Variáveis RAM
dadosRam = psutil.virtual_memory()
totalRamGB = dadosRam.total/pow(2,30)
livreRamGB = dadosRam.avaliable/pow(2,30)

#Variáveis Disco
dadosDisco = psutil.disk_usage(c:\\)
totalDiscoGB = dadosDisco.total/pow(2,30)
livreDiscoGB = dadosDisco.free/pow(2,30)
pctDiscoOcupado = dadosDisco.percent


print('Olá, seja bem vindo!')
print(f"Você tem um total de {qtdCpusTotal}, sendo {qtdCpusFisicas} físicas;")
print(f"Sua ram instalada é de {totalRamGB}")
print(f"Seu disco tem um tamanho total de {totalDiscoGB}GB;")

for (i=1, i<10, i++):
    pctCpus
    freqCpus
    listaPctCpu = [pctCpus[0], pctCpus[1], pctCpus[2], pctCpus[3]]

    dadosRam
    livreRamGB

    dadosDisco
    livreDiscoGB
    pctDiscoOcupado

    print("Uso das CPUs")
    print(f"{}
    


