-- name:save-message!
-- create a new message
INSERT INTO guestbook
(name, message, timesstamp)
VALUES (:name, :message, :timestamp)

--name:get-messages
-- selects all available messages
SELECT * from guestbook

