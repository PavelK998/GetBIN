package ru.pakarpichev.getbinapplication.domain.repository;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.pakarpichev.getbinapplication.domain.model.UserRequestModel;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BinRepository_Impl implements BinRepository {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserRequestModel> __insertionAdapterOfUserRequestModel;

  private final EntityDeletionOrUpdateAdapter<UserRequestModel> __deletionAdapterOfUserRequestModel;

  public BinRepository_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserRequestModel = new EntityInsertionAdapter<UserRequestModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `requestItem` (`id`,`request`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserRequestModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getUserRequest() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserRequest());
        }
      }
    };
    this.__deletionAdapterOfUserRequestModel = new EntityDeletionOrUpdateAdapter<UserRequestModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `requestItem` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserRequestModel value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insertData(final UserRequestModel request,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserRequestModel.insert(request);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteData(final UserRequestModel request,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfUserRequestModel.handle(request);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object gelAllData(final Continuation<? super List<UserRequestModel>> continuation) {
    final String _sql = "SELECT * FROM requestItem";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<UserRequestModel>>() {
      @Override
      public List<UserRequestModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserRequest = CursorUtil.getColumnIndexOrThrow(_cursor, "request");
          final List<UserRequestModel> _result = new ArrayList<UserRequestModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserRequestModel _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpUserRequest;
            if (_cursor.isNull(_cursorIndexOfUserRequest)) {
              _tmpUserRequest = null;
            } else {
              _tmpUserRequest = _cursor.getString(_cursorIndexOfUserRequest);
            }
            _item = new UserRequestModel(_tmpId,_tmpUserRequest);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
