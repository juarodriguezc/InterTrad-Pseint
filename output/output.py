import numpy as np                 
import os            

cls = lambda: os.system('cls' if os.name=='nt' else 'clear')  
def main():                     
	#dimensionamiento
	saldo = np.empty([int(5)], dtype = object)          
	#dimensionamiento
	usuarios = np.empty([int(5)], dtype = object)          
	#asignacion
	saldo[int(0)] = 1000       
	#asignacion
	saldo[int(1)] = 500       
	#asignacion
	saldo[int(2)] = 0       
	#asignacion
	saldo[int(3)] = 2500       
	#asignacion
	saldo[int(4)] = 1000       
	#asignacion
	usuarios[int(0)] = "5555"       
	#asignacion
	usuarios[int(1)] = "1111"       
	#asignacion
	usuarios[int(2)] = "8888"       
	#asignacion
	usuarios[int(3)] = "3333"       
	#asignacion
	usuarios[int(4)] = "2222"       
	#asignacion
	contador = 0       
	#asignacion
	busca = 0       
	#asignacion
	opc = 0       
	#asignacion
	monto = 0.0       

	#estructura de control mientras
	while( (contador != 4 ) ):       

		#estructura de control si
		if( (contador != 3 ) ):       
			#escribir
			print( "***** CAJERO AUTOMÁTICO *****" , sep="" )         
			#escribir
			print( "*                           *" , sep="" )         
			#escribir
			print( "*       INTENTO NRO " , contador + 1 , "       *" , sep="" )         
			#escribir
			print( "*                           *" , sep="" )         
			#escribir
			print( "*****************************" , sep="" )         
			#escribir
			print( " " , sep="" )         
			#escribir
			print( "CLAVE : " , sep="" )         
			#leer
			clave = input()        
			#escribir
			print( "" , sep="" )         
			cls() 

			#estructura de control para
			f = 0 
			for f in range (int(0), int(4) + 1, int(1)):       

				#estructura de control si
				if( (clave  ==  usuarios[f]) ):       
					#asignacion
					busca = f       
					#asignacion
					f = 5       
			f += 1

			#estructura de control si
			if( (busca != 0) ):       
				#asignacion
				salir = 0       

				#estructura de control mientras
				while( (salir != 4) ):       
					cls() 
					#escribir
					print( "******************************" , sep="" )         
					#escribir
					print( "*                            *" , sep="" )         
					#escribir
					print( "*    BIENVENIDOS AL BANCO    *" , sep="" )         
					#escribir
					print( "*                            *" , sep="" )         
					#escribir
					print( "******************************" , sep="" )         
					#escribir
					print( "" , sep="" )         
					#escribir
					print( "MENU DE OPCIONES" , sep="" )         
					#escribir
					print( "1. VER SALDO" , sep="" )         
					#escribir
					print( "2. DEPOSITO" , sep="" )         
					#escribir
					print( "3. RETIRO" , sep="" )         
					#escribir
					print( "4. SALIR" , sep="" )         
					#escribir
					print( "" , sep="" )         
					#escribir
					print( "OPCIÓN : " , sep="" )         
					#leer
					opc = eval(input())        
					#escribir
					print( "" , sep="" )         

					#estructura de control segun
					_expr5 = (opc)      
					if (False):
						pass
					elif ( _expr5 == 1 ):   
						#escribir
						print( "SALDO ACTUAL : " , saldo[busca] , sep="" )         
						input()
					elif ( _expr5 == 2 ):   
						#escribir
						print( "MONTO A DEPOSITAR : " , sep="" )         
						#leer
						monto = eval(input())        
						#asignacion
						saldo[int(busca)] = saldo[busca] + monto       
					elif ( _expr5 == 3 ):   
						#escribir
						print( "MONTO A RETIRAR : " , sep="" )         
						#leer
						monto = eval(input())        

						#estructura de control si
						if( (monto > saldo[busca]) ):       
							#escribir
							print( "!Error no dispone de ese Saldo!.." , sep="" )         
							input()
						else:              
							#asignacion
							saldo[int(busca)] = saldo[busca] - monto       
					elif ( _expr5 == 4 ):   
						#escribir
						print( "Gracias por su vísita, regrese pronto..." , sep="" )         
						#asignacion
						salir = 4       
						#asignacion
						contador = 4       
			else:              
				#asignacion
				contador = contador + 1       
		else:              
			#escribir
			print( "*****************************" , sep="" )         
			#escribir
			print( "*                           *" , sep="" )         
			#escribir
			print( "*     TARJETA BLOQUEADA     *" , sep="" )         
			#escribir
			print( "*                           * " , sep="" )         
			#escribir
			print( "*****************************" , sep="" )         
			#asignacion
			contador = 4       

if __name__=="__main__":     
	     main()