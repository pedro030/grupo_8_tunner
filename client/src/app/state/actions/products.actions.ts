import { createAction, props } from "@ngrx/store";
import { Product } from "src/app/Core/models/product.model";

export const loadProducts = createAction('[Products] Load Products');
export const loadedProducts = createAction('[Products] Loaded Products', props<{products: Product[]}>());
