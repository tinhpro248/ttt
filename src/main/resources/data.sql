--INSERT INTO BUILDING(ID, NAME) VALUES(-10, 'Building');
--
--INSERT INTO ROOM(ID, NAME, FLOOR, BUILDING_ID) VALUES(-10, 'Room1', 1, -10);
--INSERT INTO ROOM(ID, NAME, FLOOR, BUILDING_ID) VALUES(-9, 'Room2', 1, -10);
--
--INSERT INTO LIGHT(ID, LEVEL, STATUS, ROOM_ID) VALUES (-1, 8, 'ON', -10);
--INSERT INTO LIGHT(ID, LEVEL, STATUS, ROOM_ID) VALUES (-2, 0, 'OFF', -10);

INSERT INTO users(
	id, cccd, birthday, email, image, name, password, phonenum, type, username)
	VALUES (1, '123456789', '2001-04-10 00:00:00', 'duongtinh@gmail.com', null, 'Dương Bá Tình', '123456', '1234567891', true, 'tinhba');
INSERT INTO users(
	id, cccd, birthday, email, image, name, password, phonenum, type, username)
	VALUES (2, '123456789', '2001-04-10 00:00:00', 'duongtinh@gmail.com', null, 'Dương Bá Tình', '123456', '1234567891', false, 'datcong');
INSERT INTO users(
	id, cccd, birthday, email, image, name, password, phonenum, type, username)
	VALUES (3, '123456789', '2001-04-10 00:00:00', 'duongtinh@gmail.com', null, 'Dương Bá Tình', '123456', '1234567891', false, 'tanngoc');
INSERT INTO users(
	id, cccd, birthday, email, image, name, password, phonenum, type, username)
	VALUES (4, '123456789', '2001-04-10 00:00:00', 'duongtinh@gmail.com', null, 'Dương Bá Tình', '123456', '1234567891', false, 'toannguyen');

