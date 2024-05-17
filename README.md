# Project API Documentation

## Overview

This document provides details on the responses received when hitting specific endpoints on the server.

### API Endpoints

#### 1. `/api`

**Endpoint:** `http://localhost:8080/api`

**Response:**

When you access this endpoint, you receive a log entry as a response which is indicative of the backend process being triggered.

```bash
2024-05-16T20:57:09.855-05:00 INFO 55669 --- [demo] [nio-8080-exec-3] c.e.s.Filter2 : Hello from Filter2
```

#### 2. `/c`

**Endpoint:** `http://localhost:8080/c`

**Response:**

Accessing this endpoint also generates a specific log entry.

```bash
2024-05-16T20:57:58.595-05:00 INFO 55669 --- [demo] [nio-8080-exec-5] c.e.s.Filter1 : Hello from Filter1
```

From stackoverflow:

> So, if you want your filter to work only as a security filter, you should not expose it as a bean, and you should set it in a security filter chain like this:

```bash
.addFilterBefore(new MyFilter(), BasicAuthenticationFilter.class)
```

source: https://stackoverflow.com/questions/73865881/whats-the-proper-way-to-add-spring-security-filter-only-for-specific-url