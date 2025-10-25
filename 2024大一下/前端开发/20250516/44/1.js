const inventoryManager = {
    products: [],
    sales: [],
    addProduct(id, name, stock, price) {
        const p = this.products.find(p => p.id === id)
        if (!p) {
            this.products.push({ id, name, stock, price })
        }
        else {
            console.log('商品已存在');
        }
    },
    seilPreduct(id, quantity) {
        const p = this.products.find(p => p.id === id)
        if (!p) {
            console.log('商品不存在');
        }
        else if (p.stock < quantity) {
            console.log('库存不足，无法提货');
        }
        else {
            p.stock = p.stock - quantity
            this.sales.push({ id, quantity, total: p.price * quantity })
            console.log('提货成功');
        }
    },
    getTotalSales() {
        const total = this.sales.reduce((sum, sale) => sum + sale.total, 0) {
        console.log(`总销售额：${total}`);
    },



    }



}





















