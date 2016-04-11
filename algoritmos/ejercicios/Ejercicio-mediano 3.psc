Proceso sin_titulo
	Escribir "Ingrese la cantidad de segundos";
	Leer seg;
	h <-trunc(seg/3600);
	m <-trunc((seg%3600)/60);
	s <-trunc(seg%3600)%60;
	
	Escribir h," Horas, ",m," Minutos,",s," Segundos";
FinProceso
