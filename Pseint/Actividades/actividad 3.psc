Proceso sin_titulo
	numDesp<-0;
	kmT<-0;
	benT<-0;
	petT<-0;
	kmciu1<-0;
	kmCiu3<-0;
	kmCiu4<-0;
	costo_benT<-0;
	costo_petT<-0;
	viaje_ciu1<-0;
	viaje_ciu2<-0;
	viaje_ciu3<-0;
	viaje_ciu4<-0;
	Escribir "Ingrese las distancias de las 4 ciudades (entre 9Km - 600Km) ";
	Leer ciu1,ciu2,ciu3,ciu4;
	Repetir
		costo_ben<-0;
		ben_total<-0;
		costo_pet<-0;
		pet_hechar<-0;
		numDesp<-numDesp+1;
		Escribir "Despacho N° ",numDesp;
		Escribir "Ingrese el peso de la carga (menor a 1500Kg)";
		Leer peso;
		si(peso<=700)Entonces
			Escribir "Se ultilizara el camion bencinero, posee un estanque de 40lts";
			Escribir "tiene un rendimiento de 13Km por litro";
			camion<-1;
		Sino
			Escribir "Se ocupara el camio petrolero, posee un estanque de 60lts";
			Escribir "tiene un rendimiento de 11Km por litro";
			camion<-2;
		FinSi
		Escribir "Ingrese el numero de la ciudad destino (1)(2)(3)(4)";
		Leer ciuDest;
		Segun ciuDest Hacer
			1:
				kmIda<-ciu1;
				viaje_ciu1<-viaje_ciu1+1;
				kmCiu1<-kmida*2;
			2:
				kmIda<-ciu2;
				viaje_ciu2<-viaje_ciu2+1;
				kmCiu2<-kmida*2;
			3:
				kmIda<-ciu3;
				viaje_ciu3<-viaje_ciu3+1;
				kmCiu3<-kmida*2;
			De Otro Modo:
				kmIda<-ciu4;
				viaje_ciu4<-viaje_ciu4+1;
				kmciu4<-kmida*2;
		FinSegun
		kmT<-kmT+kmIda*2;
		Segun camion Hacer
			1:
				si(kmida>520)entonces
					escribir "Se tiene que llenar es estanque (40lts)";
					ben_Faltantes<-trunc((kmida-520)/13);
					Escribir "Durante el viaje se tienen que hechar ",ben_Faltantes," lts";
					ben_total<-(40+ben_Faltantes)*2;
					costo_ben<-ben_total*850;
				Sino
					ben_hechar<-trunc(kmida/13);
					Escribir "Se tiene que hechar ",ben_hechar," lts para la ida";
					ben_total<-ben_hechar*2;
					costo_ben<-ben_total*850;
				FinSi
			2:
				pet_hechar<-trunc(kmida/11);
				Escribir "Se tiene que hechar ",pet_hechar," lts para la ida";
				costo_pet<-(pet_hechar*610)*2;
		FinSegun
		benT<-ben_total+benT;
		petT<-pet_hechar*2+petT;
		costo_benT<-costo_ben+costo_benT;
		costo_petT<-costo_pet+costo_petT;
		Escribir "Desea Realizar otro despacho (1)SI (2)NO";
		Leer op;
	Hasta Que (op==2)
	Escribir "recuento del dia";
	Escribir "-------------------";
	Escribir "Cantidad de viajes realizados: ",numDesp*2;
	Escribir "Cantidad de Kilometros recorridos: ",kmT;
	Escribir "Cantidad de viajes a la ciudad 1: ",viaje_ciu1,"| Km a la ciudad ",kmCiu1*viaje_ciu1;
	Escribir "Cantidad de viajes a la ciudad 2: ",viaje_ciu2,"| Km a la ciudad ",kmCiu2*viaje_ciu2;
	Escribir "Cantidad de viajes a la ciudad 3: ",viaje_ciu3,"| Km a la ciudad ",kmCiu3*viaje_ciu3;
	Escribir "Cantidad de viajes a la ciudad 4: ",viaje_ciu4,"| Km a la ciudad ",kmciu4*viaje_ciu4;
	Escribir "Consumo total de combustible: ",benT," lts de bencina,",petT," lts de petroleo";
	Escribir "Costo Total de combustible :",costo_benT+costo_petT;
	Escribir "Costo en bencina: ",costo_benT;
	Escribir "Costo en petroleo: ",costo_petT;
	
FinProceso
