import mysql.connector
from credentials import usr, pswd


def insert_db(operacao, qtdBtc):
        mydb = mysql.connector.connect(
            host="localhost",
            user=usr,
            password=pswd,
            database="luizAc3So"
        )

        if mydb.is_connected():
            mycursor = mydb.cursor()

            sql_query = "INSERT INTO historico(operacao, qtdBtc, dataTempo) VALUES (%s, %s, now())"
            val = [operacao, qtdBtc]
            mycursor.execute(sql_query, val)

            mydb.commit()
            
def select_db():
        mydb = mysql.connector.connect(
        host="localhost",
        user=usr,
        password=pswd,
        database="luizAc3So"
        )

        mycursor = mydb.cursor()

        mycursor.execute("select sum(qtdBtc) as saldo from historico;")

        myresult = mycursor.fetchall()
        # print(myresult)
        for x in myresult:
            print('Saldo: ', x[0], ' BTC')    