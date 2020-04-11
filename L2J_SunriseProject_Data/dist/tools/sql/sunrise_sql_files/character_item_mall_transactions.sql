CREATE TABLE IF NOT EXISTS `character_item_mall_transactions` (
 `charId` INT UNSIGNED NOT NULL DEFAULT 0,
 `productId` INT NOT NULL DEFAULT 0,
 `quantity` INT NOT NULL DEFAULT 1,
 `transactionTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;