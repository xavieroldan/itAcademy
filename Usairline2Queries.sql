-- Select the database

USE USAirlineFlights2;

-- Exercice 1
-- Quantitat de registres de la taula de vols:

SELECT COUNT(flightID) AS 'Quantitat' 
FROM Flights;

-- Exercice 2 
-- Retard promig de sortida i arribada segons l’aeroport origen.

SELECT Origin, AVG(ArrDelay) AS "prom_arribades", AVG(DepDelay) AS "prom_sortides"
FROM Flights 
GROUP BY Origin;

-- Exercice 3
-- Retard promig d’arribada dels vols, per mesos i segons l’aeroport origen.

SELECT Origin ,colYear ,colMonth ,AVG(ArrDelay) AS "prom_arribades"
FROM Flights 
GROUP BY Origin ,colYear, colMonth
ORDER BY Origin;

-- Exercice 4
-- ara volen que en comptes del codi de l’aeroport es mostri el nom de la ciutat

SELECT City, colYear, colMonth ,AVG(ArrDelay) AS "prom_arribades"
FROM Flights 
INNER JOIN USAirports 
ON Origin=IATA
GROUP BY City, colYear, colMonth
ORDER BY Origin; 

/* Exercice 5
Les companyies amb més vols cancelats,per mesos i any. A més, han d’estar ordenades de forma
que les companyies amb més cancelacions apareguin les primeres*/

SELECT UniqueCarrier, colYear, colMonth, avg(ArrDelay) as avg_delay, sum(Cancelled) as total_cancelled
FROM flights 
WHERE Cancelled>0
GROUP BY colYear, colMonth, UniqueCarrier
ORDER BY total_cancelled DESC;

-- Exercice 6
-- L’identificador dels 10 avions que més distància han recorregut fent vols

SELECT TailNum, sum(Distance) AS 'TotalDistance'
from Flights 
WHERE TailNum!='NA'
group by TailNum 
order by sum(Distance) desc
limit 10;

/* Exercice 7
Companyies amb el seu retard promig només d’aquelles les quals 
els seus vols arriben al seu destí amb un retràs promig major de 10 minuts*/

SELECT UniqueCarrier, AVG(ArrDelay) as 'avgDelay' 
FROM Flights 
GROUP BY UniqueCarrier 
HAVING AVG(ArrDelay) > 10
ORDER BY avgDelay DESC;

