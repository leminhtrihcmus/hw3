build:
	cd server && $(MAKE) build
	cd client && $(MAKE) build

run:
	docker-compose up

test:


stop:
	docker-compose down