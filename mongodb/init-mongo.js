db.createUser(
    {
        user: "dashboard-r",
        pwd: "fmZEPshnAFd62PEz",
        roles: [
            {
                role: "read",
                db: "dashboard"
            }
        ]
    }
);
db.createUser(
    {
        user: "dashboard-rw",
        pwd: "XZnaDezjC2A7T7CW",
        roles: [
            {
                role: "readWrite",
                db: "dashboard"
            }
        ]
    }
);
