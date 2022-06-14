--本のリスト初期データ
--idカラムはオートインクリメントなので不要
INSERT INTO booktable
(book_name, volume_num,price,author_name,published_date)
VALUES
( 'Book1',36,400,'モノクレア太郎1','2018-10-04'),
( 'Book2',40,400,'モノクレア太郎2','2018-09-28'),
( 'Book3',6,400,'モノクレア太郎3','2018-11-30'),
( 'Book4',1,400,'モノクレア太郎4','1915-11-01')
;