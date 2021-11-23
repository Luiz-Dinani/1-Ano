from connectdb import *
import random
import time

while True:
    operacao = random.randint(0,1) #0 = Venda, 1 = Compra
    qtdBtc = random.random()

    if operacao == 0:
        operacao = "Venda"
        qtdBtc = qtdBtc*(-1)
    else:
        operacao = "Compra"
    
    insert_db(operacao, qtdBtc)
    print('=====================')
    print('Operação: ', operacao)
    print('Quantidade de BTC: ', qtdBtc)    
    select_db()
    
    time.sleep(5)