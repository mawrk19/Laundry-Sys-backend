// src/main/java/com/example/demo/invoice/InvoiceRepository.java
package com.example.demo.invoice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}