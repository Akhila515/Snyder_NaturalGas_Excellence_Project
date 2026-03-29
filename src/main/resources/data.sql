-- LDC Charges
INSERT INTO ldc_charges VALUES (1,'Pooling Fee',1,1,0);
INSERT INTO ldc_charges VALUES (2,'LDC sample charge',2,3,1);
INSERT INTO ldc_charges VALUES (3,'Amaston-1',3,3,2);
INSERT INTO ldc_charges VALUES (4,'pp-Dup',4,2,3);
INSERT INTO ldc_charges VALUES (5,'final charge',5,4,4);
INSERT INTO ldc_charges VALUES (6,'new charge',6,5,5);
INSERT INTO ldc_charges VALUES (7,'dcf-Dup',7,8,6);
INSERT INTO ldc_charges VALUES (8,'charge19',8,6,7);

-- Meter Type
INSERT INTO meter_type (ldc_id,meter_type_id,meter_type,created_by,created_on,updated_by,updated_on) VALUES
(1,1,'Commercial','Akhila','2026-03-13','Akhila','2026-03-20'),
(1,2,'Residential','Akhila','2026-03-13','Akhila','2026-03-20'),
(3,3,'RESI','Akhila','2026-03-13','Akhila','2026-03-20'),
(4,4,'Industrial','Akhila','2026-03-13','Akhila','2026-03-20'),
(4,5,'Sample Meter','Akhila','2026-03-13','Akhila','2026-03-20'),
(6,6,'C/I','Akhila','2026-03-13','Akhila','2026-03-20'),
(7,7,'final meter','Akhila','2026-03-13','Akhila','2026-03-20'),
(8,8,'new meter','Akhila','2026-03-13','Akhila','2026-03-20');

-- LDC Daily Quantity
INSERT INTO ldc_daily_quantity (ldc_id,daily_type_id,name,abbreviation,start_date,end_date) VALUES
(1,1,'CGO Charge',NULL,NULL,NULL),
(2,2,'Base Load',NULL,NULL,NULL),
(3,3,'TEST DUKE ENERGY',NULL,NULL,NULL),
(4,4,'ZZ Test DQ type',NULL,NULL,NULL),
(5,5,'Contract Demand',NULL,NULL,NULL);

-- LDC Tariff
INSERT INTO ldc_tariff (ldc_id,ldc_rr_id,meter_type,unit,amount) VALUES
(1,1,'Commercial','T',500),
(2,2,'Residential','M',100),
(3,3,'C/I','C',200),
(4,4,'Industrial','T',600),
(5,5,'new meter','M',300);

-- Monthly Tolerance
INSERT INTO monthly_tolerance (ldc_id,category_id,name,target_notes,status,use_as_exception) VALUES
(1,1,'Test','test','Y','N'),
(2,3,'jkh','jkh','Y','N'),
(4,4,'test1','test1','Y','N'),
(5,8,'testCombo','asd','Y','Y'),
(3,10,'Sample1','storage','Y','N'),
(3,11,'Test1','test','Y','N');

-- Pooling Points
INSERT INTO pooling_points (ldc_id,ldc_pooling_id,pool_name,account_number,primary_pipeline) VALUES
(1,77,'STBA Choice NY','10029',24),
(2,80,'NP1 Pool','10062',15),
(1,81,'CHOICE 25-26 BEDFORD','10063',15),
(3,82,'REPUBLIC STEEL COH 23N-2','10064',18),
(4,83,'12130 - FRPS EAST','10069',20),
(7,88,'sample ldc pool','11455',25),
(8,90,'INMETCO','114467',28);