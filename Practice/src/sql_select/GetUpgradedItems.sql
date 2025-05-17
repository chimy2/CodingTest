-- 업그레이드 된 아이템 구하기

-- mysql
select c.item_id, c.item_name, c.rarity from item_info p join item_tree t on p.item_id = t.parent_item_id and p.rarity = 'RARE' join item_info c on t.item_id = c.item_id order by c.item_id desc;