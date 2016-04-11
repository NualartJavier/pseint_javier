Proceso LUDO
	casT<-30;
	turno<-1;
	casJug1<-0;
	casJug2<-0;
	jExtras<-0;
	j2Extras<-0;
	Escribir "Juego Ludo,Consiste en un juego de mesa de 2 jugadores; el objetivo es avanzar sobre un tablero de 30 casillas, la cantidad de espacios que se avanza se obtienen mediante el lanzamiento de 2 dados";
	Escribir "Ganara el jugador que llegue primero a la ultima casilla";
	Escribir "Reglas";
	Escribir "-Los turnos de los jugadores son intercalados";
	Escribir "-Si el resultado de los dados lanzados son iguales el jugador tiene derecho a una nueva jugada inmediatamente";
	Escribir "-Si un jugador cae en una casilla multiplo  de 10 puede avanzar automaticamente 3 espacios";
	Escribir "-Si un jugador cae en una casilla de multiplo de 7, debe retroceder 2 espacios";
	Escribir "-Si un jugador cae en una casilla ocupada por el otro jugador debe retroceder 1 espacio";
	Escribir "-La llegada debe ser con con numeros exactos, en caso de que se pase el jugador debe retroceder los espacios que sobren";
	Escribir "El juego comenzo!!!!!!!!";
	Repetir
		Escribir "Turno n°",turno;
		Escribir "Juega jugador 1";
		Repetir
			repetir
				Escribir "Jugador1 oprima (1) para lanzar los dados ";
				Leer op;
				si (op<>1)entonces
					Escribir "El jugador actual no ha lanzado los dados";
				FinSi
			Hasta Que (op=1) 
			dado1jug1<-azar(6)+1;
			dado2jug1<-azar(6)+1;
			avanza1<-(dado1jug1+dado2jug1)
			casJug1<-casJug1+avanza1;
			Escribir "Lanzamiento del dado 1: ",dado1jug1;
			Escribir "Lanzamiento del dado 2: ",dado2jug1;
			Escribir "Avanza ",avanza1," Casillas";
			si(casJug1<30)entonces
			 si casJug1 Es Multiplo De 10 Entonces
				Escribir "Has caido en una casilla multiplo de 10, avanza 3 casillas adicionales";
				casJug1<-(casJug1+3);
			 finsi
		     si casJug1 Es Multiplo De 7 Entonces
				Escribir "Has caido en una casilla multiplo de 7, retrocede 2 casillas";
				casJug1<-(casJug1-2);
			 FinSi
		 FinSi
		 
			si(casJug1>casT)entonces
				ret1<-casJug1-casT;
				casJug1<-casJug1-(ret1*2);
				Escribir "Has pasado de la casilla N°30, retrocede ",ret1," casillas";
			FinSi
			Escribir "El jugador1 quedo en la casilla ",casJug1;
			si (dado1jug1=dado2jug1)entonces
				Escribir "Felicidades ha salido el mismo numero en los 2 dados, tienes derecho a otra jugada";
				jExtras<-jExtras+1;
			FinSi
		Hasta Que (dado1jug1<>dado2jug1)
		Escribir "Juega jugador 2";
		Repetir
			repetir
				Escribir "Jugador2 oprima (1) para lanzar los dados ";
				Leer op2;
				si (op2<>1)entonces
					Escribir "El jugador actual no ha lanzado los dados";
				FinSi
			Hasta Que (op2=1) 
			dado1jug2<-azar(6)+1;
			dado2jug2<-azar(6)+1;
			avanza2<-(dado1jug2+dado2jug2)
			casJug2<-casJug2+avanza2;
			Escribir "Lanzamiento del dado 1: ",dado1jug2;
			Escribir "Lanzamiento del dado 2: ",dado2jug2;
			Escribir "Avanza ",avanza1," Casillas";
			si(casJug2<30)entonces
				si casJug2 Es Multiplo De 10 Entonces
					Escribir "Has caido en una casilla multiplo de 10, avanza 3 casillas adicionales";
					casJug2<-(casJug2+3);
				finsi
				si casJug2 Es Multiplo De 7 Entonces
					Escribir "Has caido en una casilla multiplo de 7, retrocede 2 casillas";
					casJug2<-(casJug2-2);
				FinSi
			FinSi
			
			si(casJug2>casT)entonces
				ret2<-casJug2-casT;
				casJug2<-casJug2-(ret2*2);
				Escribir "Has pasado de la casilla N°30, retrocede ",ret2," casillas";
			FinSi
			Escribir "El jugador2 quedo en la casilla ",casJug2;
			si (dado1jug2=dado2jug2)entonces
				Escribir "Felicidades ha salido el mismo numero en los 2 dados, tienes derecho a otra jugada";
				j2Extras<-j2Extras+1;
			FinSi
		Hasta Que (dado1jug2<>dado2jug2)
		turno<-turno+1
	Hasta Que (casJug1=casT o casJug2=casT)
	Escribir "El juego termino";
	si(casJug1=casT)Entonces
		Escribir "El ganador es el jugador 1,Gano con ",turno+jExtras," Jugadas";
	Sino
		Escribir "El ganador es el jugador 2,Gano con ",turno+j2Extras," Jugadas";
	FinSi
	
FinProceso
