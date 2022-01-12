import numpy as np                 
import time                        
import os            

cls = lambda: os.system('cls' if os.name=='nt' else 'clear')  
def main():                     
	#escribir
	print( "Presione una tecla para iniciar el lanzamiento!" , sep="" )         
	input()
	#dimensionamiento
	cohete = np.empty([int(9)], dtype = object)          
	#asignacion
	cohete[int(0)] = "   /|\   "       
	#asignacion
	cohete[int(1)] = "   |B|   "       
	#asignacion
	cohete[int(2)] = "   |O|   "       
	#asignacion
	cohete[int(3)] = "   |M|   "       
	#asignacion
	cohete[int(4)] = "   |B|   "       
	#asignacion
	cohete[int(5)] = "  //|\\  "       
	#asignacion
	cohete[int(6)] = " ******* "       
	#asignacion
	cohete[int(7)] = "* * * * *"       
	#asignacion
	cohete[int(8)] = " * * * * "       

	#estructura de control para
	i = 0 
	for i in range (int(1), int(11) + 1):       
		cls() 

		#estructura de control para
		j = 0 
		for j in range (int(1), int(15) + 1):       
			#escribir
			print( "" , sep="" )         
		j += 1

		#estructura de control para
		j = 0 
		for j in range (int(0), int(5) + 1):       
			#escribir
			print( cohete[j] , sep="" )         
		j += 1
		#escribir
		print( "" , sep="" )         
		#escribir
		print( "Lanzamiento en " , 11-i , sep="" )         
		time.sleep( 1 )
	i += 1

	#estructura de control para
	i = 0 
	for i in range (int(1), int(15) + 1):       
		cls() 

		#estructura de control para
		j = 0 
		for j in range (int(i), int(15) + 1):       
			#escribir
			print( "" , sep="" )         
		j += 1

		#estructura de control para
		j = 0 
		for j in range (int(0), int(7) + 1):       
			#escribir
			print( cohete[j] , sep="" )         
		j += 1

		#estructura de control si
		if( i>1 ):       
			#escribir
			print( " * * * * " , sep="" )         
		time.sleep( 1/i )
	i += 1
	#dimensionamiento
	estado = np.empty([int(6)], dtype = object)          
	#asignacion
	estado[int(0)] = 3       
	#asignacion
	estado[int(1)] = 2       
	#asignacion
	estado[int(2)] = 1       
	#asignacion
	estado[int(3)] = 2       
	#asignacion
	estado[int(4)] = 3       
	#asignacion
	estado[int(5)] = 4       

	#estructura de control para
	i = 0 
	for i in range (int(1), int(10) + 1):       
		cls() 

		#estructura de control para
		j = 0 
		for j in range (int(0), int(5) + 1):       
			#asignacion
			estado[int(j)] = estado[j]-1       

			#estructura de control segun
			_expr3 = estado[j]      
			if (False):
				pass
			elif ( _expr3 == 0 ):   
				#asignacion
				cohete[int(j)] = "    +    "       
			elif ( _expr3 == -1 ):   
				#asignacion
				cohete[int(j)] = "   +X+   "       
			elif ( _expr3 == -5 ):   
				#asignacion
				cohete[int(j)] = "   +X+   "       
			elif ( _expr3 == -2 ):   
				#asignacion
				cohete[int(j)] = "  +XXX+  "       
			elif ( _expr3 == -4 ):   
				#asignacion
				cohete[int(j)] = "  +XXX+  "       
			elif ( _expr3 == -3 ):   
				#asignacion
				cohete[int(j)] = " +XXXXX+ "       
			elif ( _expr3 == -6 ):   
				#asignacion
				cohete[int(j)] = "         "       
			#escribir
			print( cohete[j] , sep="" )         
		j += 1
		time.sleep( 0.2 )
	i += 1

if __name__=="__main__":     
	     main()