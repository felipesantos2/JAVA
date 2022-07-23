SELECT first_name, last_name, address
FROM sakila.customer JOIN sakila.address
ON customer.address_id = customer.address_id;
-------------------------------------------
SELECT first_name, last_name, address
FROM customer JOIN address
ON customer.address_id = customer.address_id;

--------------------------------------------
SELECT title, name FROM sakila.film
INNER JOIN sakila.`language`
ON film.language_id = language.language_id;
---------------------------------------------




