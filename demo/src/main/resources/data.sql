-- ==========================
-- WAREHOUSE
-- ==========================
INSERT INTO warehouse (warehouse_name,address,space_available,city,state) VALUES
                                                                              ('Mumbai Central Warehouse','Andheri East',5000,'Mumbai','Maharashtra'),
                                                                              ('Pune Distribution Hub','Hinjewadi',4200,'Pune','Maharashtra'),
                                                                              ('Bengaluru Hub','Whitefield',3900,'Bengaluru','Karnataka'),
                                                                              ('Hyderabad Logistics Center','Gachibowli',6100,'Hyderabad','Telangana'),
                                                                              ('Chennai Warehouse','Guindy',4700,'Chennai','Tamil Nadu');

-- ==========================
-- CUSTOMER
-- ==========================
INSERT INTO customer (customer_name,customer_address,email,phone,city,state) VALUES
                                                                                 ('Rahul Sharma','Andheri','rahul@gmail.com','9876500001','Mumbai','Maharashtra'),
                                                                                 ('Priya Nair','Baner','priya@gmail.com','9876500002','Pune','Maharashtra'),
                                                                                 ('Arjun Mehta','Indiranagar','arjun@gmail.com','9876500003','Bengaluru','Karnataka'),
                                                                                 ('Sneha Patil','Aundh','sneha@gmail.com','9876500004','Pune','Maharashtra'),
                                                                                 ('Rohan Kulkarni','Thane','rohan@gmail.com','9876500005','Mumbai','Maharashtra'),
                                                                                 ('Amit Verma','Madhapur','amit@gmail.com','9876500006','Hyderabad','Telangana'),
                                                                                 ('Neha Joshi','Guindy','neha@gmail.com','9876500007','Chennai','Tamil Nadu'),
                                                                                 ('Vikas Singh','Borivali','vikas@gmail.com','9876500008','Mumbai','Maharashtra'),
                                                                                 ('Ananya Rao','Koramangala','ananya@gmail.com','9876500009','Bengaluru','Karnataka'),
                                                                                 ('Karan Shah','Powai','karan@gmail.com','9876500010','Mumbai','Maharashtra');

-- ==========================
-- DRIVER
-- ==========================
INSERT INTO driver (driver_name,driver_phone,driver_address,driavailable) VALUES
                                                                              ('Suresh','9000000001','Mumbai','available'),
                                                                              ('Mahesh','9000000002','Mumbai','available'),
                                                                              ('Ganesh','9000000003','Pune','available'),
                                                                              ('Rakesh','9000000004','Pune','available'),
                                                                              ('Imran','9000000005','Hyderabad','available'),
                                                                              ('Ajay','9000000006','Chennai','available'),
                                                                              ('Ravi','9000000007','Bengaluru','available'),
                                                                              ('Deepak','9000000008','Mumbai','available'),
                                                                              ('Nitin','9000000009','Pune','available'),
                                                                              ('Akash','9000000010','Hyderabad','available');

-- ==========================
-- VEHICLE
-- Driver is assigned later using API
-- ==========================
INSERT INTO vehicle (vehavailable,vehiclename,capacity) VALUES
                                                            ('available','Tata Ace',1200),
                                                            ('available','Mahindra Bolero Pickup',1500),
                                                            ('available','Ashok Leyland Dost',1800),
                                                            ('under_maintainence','Tata 407',3000),
                                                            ('available','Eicher Pro 2049',3500),
                                                            ('available','Mahindra Jeeto',900),
                                                            ('available','Tata Intra',1400),
                                                            ('available','Ashok Bada Dost',2000),
                                                            ('under_maintainence','Eicher Pro 2055',4000),
                                                            ('available','Force Traveller',1600);

-- ==========================
-- SHIPMENT
-- Driver removed
-- Vehicle retained
-- ==========================
INSERT INTO shipment
(receiver_name,receiver_address,trackingnumber,custid,status,weight,createdate,estimateddelivery,wareid,vehicleid)
VALUES
    ('A','Mumbai','TRK100001',1,'CREATED',120,'2026-07-20 09:00:00','2026-07-24',1,1),
    ('B','Pune','TRK100002',2,'IN_TRANSIT',250,'2026-07-19 10:00:00','2026-07-22',2,2),
    ('C','Hyderabad','TRK100003',3,'DELIVERED',500,'2026-07-15 11:00:00','2026-07-18',4,5),
    ('D','Chennai','TRK100004',4,'CREATED',90,'2026-07-20 08:30:00','2026-07-23',5,3),
    ('E','Mumbai','TRK100005',5,'IN_TRANSIT',300,'2026-07-18 14:00:00','2026-07-21',1,7),
    ('F','Pune','TRK100006',6,'DELIVERED',600,'2026-07-14 09:30:00','2026-07-17',2,5),
    ('G','Bengaluru','TRK100007',7,'CREATED',140,'2026-07-20 12:00:00','2026-07-25',3,6),
    ('H','Hyderabad','TRK100008',8,'IN_TRANSIT',420,'2026-07-17 16:30:00','2026-07-22',4,2),
    ('I','Chennai','TRK100009',9,'DELIVERED',700,'2026-07-12 10:00:00','2026-07-16',5,7),
    ('J','Mumbai','TRK100010',10,'CREATED',180,'2026-07-20 13:00:00','2026-07-24',1,8);