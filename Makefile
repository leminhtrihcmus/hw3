build:
	cd server && $(MAKE) build
	cd client && $(MAKE) build

run:
	docker-compose up --detach

stop:
	docker-compose down