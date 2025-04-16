INSERT INTO address (id, street, postal_code, city) VALUES
(1, 'Kolforsvägen 42', '81693', 'Ockelbo'),
(2,'Forellvägen 13','80632','Gävle'),
(3,'Snickargatan 8','52455','Stockholm'),
(4,'Klockarbacken 3','30451','Uddevalla'),
(5,'Sjöängsgatan 1','63452','Linköping');

INSERT INTO members (first_name, last_name, email, phone, date_of_birth, address_id) VALUES
('Aracely', 'Campos', 'aracely.campos@hotmail.com', '0704349767', '1994-04-08', 1),
('Masha', 'Carrillo', 'mashathesamoyed@gmail.com', '0704312415', '2020-07-14', 2),
('Enna', 'Dedic', 'enna@outlook.se', '0724569466', '1988-04-01', 3),
('Rafael','Rivas', 'rivas@gmail.com', '0739994445', '1966-10-24', 4),
('Sonia', 'Aguillar', 'sonia63@gmail.com', '026143567', '1963-01-25', 5);