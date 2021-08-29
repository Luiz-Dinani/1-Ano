import psutil

print('Olá, seja bem vindo!')

#Variáveis CPU
qtdCpusTotal = psutil.cpu_count()
qtdCpusFisicas = psutil.cpu_count(logical = False)
freqCpus = psutil.cpu_freq().current

#Variáveis RAM
dadosRam = psutil.virtual_memory()
totalRamGB = dadosRam.total/pow(2,30)
livreRamGB = dadosRam.free/pow(2,30)
ocupadoRamGB = dadosRam.used/pow(2,30)
ocupadoRamPct = dadosRam.percent

#Variáveis Disco
discoUser = input("Qual partição do disco você vai querer monitorar? (Escreva apenas a letra, por exemplo C)")
dadosDisco = psutil.disk_usage(f'{discoUser}:\\')
totalDiscoGB = dadosDisco.total/pow(2,30)
livreDiscoGB = dadosDisco.free/pow(2,30)
ocupadoDiscoPct = dadosDisco.percent
ocupadoDiscoGB = (totalDiscoGB*(ocupadoDiscoPct/100))


print(f"Você tem um total de {qtdCpusTotal} CPUS, sendo {qtdCpusFisicas} físicas;")
print(f"Sua ram instalada é de {totalRamGB:.2f} GB")
print(f"Seu disco {discoUser.upper()} tem um tamanho total de {totalDiscoGB:.2f} GB;")

for index in range(10):
    pctCpus = psutil.cpu_percent(percpu = True, interval = 5)
    freqCpus
    listaPctCpu = []

    for i in range(qtdCpusTotal):
        listaPctCpu.append(pctCpus[i])

    dadosRam
    livreRamGB
    ocupadoRamGB
    ocupadoRamPct

    dadosDisco
    livreDiscoGB
    ocupadoDiscoPct
    ocupadoDiscoGB

    print("Monitoramento de CPUs")
    print(f"Frequência das CPUs {freqCpus} MHz")
    for i in range(qtdCpusTotal):
        print(f"CPU {i+1} {listaPctCpu[i]} %")

    print("\n")

    print("Monitoramento de RAM")
    print(f"Livre: {livreRamGB:.2f} GB ({(100-ocupadoRamPct):.2f} %) \nUsado: {ocupadoRamGB:.2f} GB ({ocupadoRamPct} %)" + 
           f"\nTotal: {totalRamGB:.2f} GB")

    print("\n")

    print(f"Monitoramento do Disco {discoUser.upper()}")
    print(f"Livre: {livreDiscoGB:.2f} GB ({100-ocupadoDiscoPct:.2f} %)" + 
           f"\nUsado: {ocupadoDiscoGB:.2f} GB ({ocupadoDiscoPct:.2f} %) \nTotal de {totalDiscoGB:.2f} GB")
    
    print("\n")